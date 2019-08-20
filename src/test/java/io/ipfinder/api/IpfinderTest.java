package io.ipfinder.api;

import static org.junit.jupiter.api.Assertions.*;

import io.ipfinder.api.Ipfinder;
import io.ipfinder.api.exception.IPfinderException;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class IpfinderTest

{

	@Test
	public void testIpfinderToken() {
		Ipfinder ipfinder = new Ipfinder("tttttoooooooooooookkkkkkkkkkkkeeeeeeeeeeennnnnnn", "fakedomain");
		assertEquals("tttttoooooooooooookkkkkkkkkkkkeeeeeeeeeeennnnnnn", ipfinder.token);
	}

	@Test
	public void testIpfinderbaseUrl() {
		Ipfinder ipfinder = new Ipfinder("tttttoooooooooooookkkkkkkkkkkkeeeeeeeeeeennnnnnn", "fakedomain");
		assertEquals("fakedomain", ipfinder.baseUrl);
	}

	@Test
	public void testFreeToken() {
		Ipfinder ipfinder = new Ipfinder("", "");
		assertEquals("free", ipfinder.token);
	}

	@Test
	public void testBaseUrl() {
		Ipfinder ipfinder = new Ipfinder("", "");
		assertEquals("https://api.ipfinder.io/v1/", ipfinder.baseUrl);
	}

	@Test
	public void testGetStatus() {
		String path = "info";
		Ipfinder ipfinder = new Ipfinder("", "");

		assertEquals(path, ipfinder.STATUS_PATH);
	}

	@Test
	public void testGetRanges() {
		String path = "ranges/";
		Ipfinder ipfinder = new Ipfinder("", "");

		assertEquals(path, ipfinder.RANGES_PATH);
	}

	@Test
	public void testGetFirewall() {
		String path = "firewall/";
		Ipfinder ipfinder = new Ipfinder("", "");

		assertEquals(path, ipfinder.FIREWALL_PATH);
	}

	@Test
	public void testGetDomain() {

		String path = "domain/";
		Ipfinder ipfinder = new Ipfinder("", "");

		assertEquals(path, ipfinder.DOMAIN_PATH);

	}

	@Test
	public void testGetDomainHistory() {
		String path = "domainhistory/";
		Ipfinder ipfinder = new Ipfinder("", "");

		assertEquals(path, ipfinder.DOMAIN_H_PATH);

	}

	@Test
	public void testGetDomainBy() {

		String path = "domainby/";
		Ipfinder ipfinder = new Ipfinder("", "");

		assertEquals(path, ipfinder.DOMAIN_BY_PATH);
	}

	@Test
	@DisplayName("Invalid IPaddress")
	public void testAddress() throws IPfinderException {
		String ip = "1..0.0.0";
		Ipfinder ipfinder = new Ipfinder("tttttoooooooooooookkkkkkkkkkkkeeeeeeeeeeennnnnnn", "");
		// ipfinder.getAddressInfo(ip);
		assertThrows(IPfinderException.class, () -> ipfinder.getAddressInfo(ip));
	}

	@Test
	@DisplayName("Invalid Domain name")
	public void testAsn() throws IPfinderException {

		String asn = "as";
		Ipfinder ipfinder = new Ipfinder("tttttoooooooooooookkkkkkkkkkkkeeeeeeeeeeennnnnnn", "");
		// ipfinder.getAddressInfo(ip);
		assertThrows(IPfinderException.class, () -> ipfinder.getAsn(asn));
	}

	@Test
	@DisplayName("Invalid Domain name")
	public void testDomain() throws IPfinderException {

		String domain = "domain";
		Ipfinder ipfinder = new Ipfinder("tttttoooooooooooookkkkkkkkkkkkeeeeeeeeeeennnnnnn", "");
		// ipfinder.getAddressInfo(ip);
		assertThrows(IPfinderException.class, () -> ipfinder.getDomain(domain));

	}

	@Test
	@DisplayName("Invalid Format supported format https://ipfinder.io/docs/?shell#firewall")
	public void testFirewallFormat() throws IPfinderException {

		String asn = "as1";
		Ipfinder ipfinder = new Ipfinder("tttttoooooooooooookkkkkkkkkkkkeeeeeeeeeeennnnnnn", "");
		// ipfinder.getAddressInfo(ip);
		assertThrows(IPfinderException.class, () -> ipfinder.getFirewall(asn, "asdasd"));

	}

	@Test
	@DisplayName("Invalid Firewall string please use AS number or ISO 3166-1 alpha-2 country")
	public void testFirewallBy() throws IPfinderException {

		String country = "DZZZ";
		Ipfinder ipfinder = new Ipfinder("tttttoooooooooooookkkkkkkkkkkkeeeeeeeeeeennnnnnn", "");
		// ipfinder.getAddressInfo(ip);
		assertThrows(IPfinderException.class, () -> ipfinder.getFirewall(country, "juniper_junos"));

	}

}
