
PN = "perl-Test-NoWarnings"
PE = "0"
PV = "1.06"
PR = "10.el10"
PACKAGES = "perl-Test-NoWarnings perl-Test-NoWarnings-tests"


URI_perl-Test-NoWarnings = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-NoWarnings-1.06-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-NoWarnings = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(Test::Builder) ( ) perl(Test::NoWarnings::Warning) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-Test-NoWarnings = "perl(Test::NoWarnings) ( =  1.06) perl(Test::NoWarnings::Warning) ( =  1.06) perl-Test-NoWarnings ( =  1.06-10.el10)"

URI_perl-Test-NoWarnings-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-NoWarnings-tests-1.06-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-NoWarnings-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(Test::Tester) ( ) perl(Test::NoWarnings) ( ) perl-Test-NoWarnings ( =  1.06-10.el10)"
RPROVIDES:perl-Test-NoWarnings-tests = "perl-Test-NoWarnings-tests ( =  1.06-10.el10)"
