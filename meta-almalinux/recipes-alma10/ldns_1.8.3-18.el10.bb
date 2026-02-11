
PN = "ldns"
PE = "0"
PV = "1.8.3"
PR = "18.el10"
PACKAGES = "ldns ldns-devel ldns-doc ldns-utils perl-ldns python3-ldns"


URI_ldns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ldns-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ldns = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) ca-certificates ( )"
RPROVIDES:ldns = "libldns.so.3()(64bit) ( ) ldns ( =  1.8.3-18.el10) ldns(x86-64) ( =  1.8.3-18.el10)"

URI_ldns-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ldns-devel-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ldns-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) /usr/bin/sh ( ) openssl-devel ( ) libldns.so.3()(64bit) ( ) ldns(x86-64) ( =  1.8.3-18.el10)"
RPROVIDES:ldns-devel = "ldns-devel ( =  1.8.3-18.el10) ldns-devel(x86-64) ( =  1.8.3-18.el10) pkgconfig(ldns) ( =  1.8.3)"

URI_ldns-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ldns-doc-1.8.3-18.el10.noarch.rpm;unpack=0"
RDEPENDS:ldns-doc = ""
RPROVIDES:ldns-doc = "ldns-doc ( =  1.8.3-18.el10)"

URI_ldns-utils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ldns-utils-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ldns-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libssl.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libldns.so.3()(64bit) ( ) libpcap.so.1()(64bit) ( ) ldns(x86-64) ( =  1.8.3-18.el10)"
RPROVIDES:ldns-utils = "ldns-utils ( =  1.8.3-18.el10) ldns-utils(x86-64) ( =  1.8.3-18.el10)"

URI_perl-ldns = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-ldns-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-ldns = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(DNS::LDNS) ( ) perl(DNS::LDNS::DNSSecDataChain) ( ) perl(DNS::LDNS::DNSSecName) ( ) perl(DNS::LDNS::DNSSecRRSets) ( ) perl(DNS::LDNS::DNSSecRRs) ( ) perl(DNS::LDNS::DNSSecTrustTree) ( ) perl(DNS::LDNS::DNSSecZone) ( ) perl(DNS::LDNS::GC) ( ) perl(DNS::LDNS::Key) ( ) perl(DNS::LDNS::KeyList) ( ) perl(DNS::LDNS::Packet) ( ) perl(DNS::LDNS::RBNode) ( ) perl(DNS::LDNS::RBTree) ( ) perl(DNS::LDNS::RData) ( ) perl(DNS::LDNS::RR) ( ) perl(DNS::LDNS::RRList) ( ) perl(DNS::LDNS::Resolver) ( ) perl(DNS::LDNS::Zone) ( ) perl(:MODULE_COMPAT_5.40.1) ( ) perl(AutoLoader) ( ) ldns(x86-64) ( =  1.8.3-18.el10) perl(:VERSION) ( >=  5.14.2) perl(:VERSION) ( >=  5.8.8)"
RPROVIDES:perl-ldns = "perl(DNS::LDNS) ( =  0.61) perl(DNS::LDNS::DNSSecDataChain) ( =  0.61) perl(DNS::LDNS::DNSSecName) ( =  0.61) perl(DNS::LDNS::DNSSecRRSets) ( =  0.61) perl(DNS::LDNS::DNSSecRRs) ( =  0.61) perl(DNS::LDNS::DNSSecTrustTree) ( =  0.61) perl(DNS::LDNS::DNSSecZone) ( =  0.61) perl(DNS::LDNS::GC) ( =  0.61) perl(DNS::LDNS::Key) ( =  0.61) perl(DNS::LDNS::KeyList) ( =  0.61) perl(DNS::LDNS::Packet) ( =  0.61) perl(DNS::LDNS::RBNode) ( =  0.61) perl(DNS::LDNS::RBTree) ( =  0.61) perl(DNS::LDNS::RData) ( =  0.61) perl(DNS::LDNS::RR) ( =  0.61) perl(DNS::LDNS::RRList) ( =  0.61) perl(DNS::LDNS::Resolver) ( =  0.61) perl(DNS::LDNS::Zone) ( =  0.61) perl-ldns ( =  1.8.3-18.el10) perl-ldns(x86-64) ( =  1.8.3-18.el10)"

URI_python3-ldns = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-ldns-1.8.3-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-ldns = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libssl.so.3()(64bit) ( ) libldns.so.3()(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libc.so.6(GLIBC_2.28)(64bit) ( ) python(abi) ( =  3.12) ldns(x86-64) ( =  1.8.3-18.el10)"
RPROVIDES:python3-ldns = "python-ldns ( =  1.8.3-18.el10) python3-ldns ( =  1.8.3-18.el10) python3-ldns(x86-64) ( =  1.8.3-18.el10) python3.12-ldns ( =  1.8.3-18.el10)"
