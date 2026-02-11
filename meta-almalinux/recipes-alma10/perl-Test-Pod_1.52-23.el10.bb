
PN = "perl-Test-Pod"
PE = "0"
PV = "1.52"
PR = "23.el10"
PACKAGES = "perl-Test-Pod perl-Test-Pod-tests"


URI_perl-Test-Pod = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Pod-1.52-23.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Pod = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Test::Builder) ( ) perl(File::Find) ( ) perl(Pod::Simple) ( >=  3.05) perl(Test::More) ( >=  0.62)"
RPROVIDES:perl-Test-Pod = "perl(Test::Pod) ( =  1.52) perl-Test-Pod ( =  1.52-23.el10)"

URI_perl-Test-Pod-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Pod-tests-1.52-23.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Pod-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Test::Builder) ( ) perl(Test::Builder::Tester) ( ) perl-Test-Pod ( =  1.52-23.el10)"
RPROVIDES:perl-Test-Pod-tests = "perl-Test-Pod-tests ( =  1.52-23.el10)"
