
PN = "perl-JSON"
PE = "0"
PV = "4.10"
PR = "7.el10"
PACKAGES = "perl-JSON perl-JSON-tests"


URI_perl-JSON = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-JSON-4.10-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-JSON = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(overload) ( ) perl(Encode) ( ) perl(bytes) ( ) perl(B) ( ) perl(Math::BigInt) ( ) perl(Math::BigFloat) ( ) perl(:VERSION) ( >=  5.6.0) perl(:VERSION) ( >=  5.5.0)"
RPROVIDES:perl-JSON = "perl(JSON) ( =  4.10) perl-JSON ( =  4.10-7.el10)"

URI_perl-JSON-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-JSON-tests-4.10-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-JSON-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(vars) ( ) perl(Data::Dumper) ( ) perl(utf8) ( ) perl(overload) ( ) coreutils ( ) perl(Encode) ( ) perl(Tie::Hash) ( ) perl(Tie::Array) ( ) perl(charnames) ( ) perl(JSON) ( ) perl(Tie::IxHash) ( ) perl-JSON ( =  4.10-7.el10)"
RPROVIDES:perl-JSON-tests = "perl-JSON-tests ( =  4.10-7.el10)"
