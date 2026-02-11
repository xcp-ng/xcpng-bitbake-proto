
PN = "perl-Readonly"
PE = "0"
PV = "2.05"
PR = "27.el10"
PACKAGES = "perl-Readonly perl-Readonly-tests"


URI_perl-Readonly = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Readonly-2.05-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Readonly = "perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(vars) ( ) perl(Storable) ( ) perl(:VERSION) ( >=  5.5.0)"
RPROVIDES:perl-Readonly = "perl(Readonly::Array) ( ) perl(Readonly::Hash) ( ) perl(Readonly::Scalar) ( ) perl(Readonly) ( =  2.05) perl-Readonly ( =  2.05-27.el10)"

URI_perl-Readonly-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Readonly-tests-2.05-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Readonly-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(vars) ( ) perl(Readonly) ( ) perl-Readonly ( =  2.05-27.el10)"
RPROVIDES:perl-Readonly-tests = "perl-Readonly-tests ( =  2.05-27.el10)"
