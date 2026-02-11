
PN = "perl-Test-Exception"
PE = "0"
PV = "0.43"
PR = "29.el10"
PACKAGES = "perl-Test-Exception perl-Test-Exception-tests"


URI_perl-Test-Exception = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Exception-0.43-29.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Exception = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(base) ( ) perl(Test::Builder) ( ) perl(Sub::Uplevel) ( )"
RPROVIDES:perl-Test-Exception = "perl(Test::Exception) ( =  0.43) perl-Test-Exception ( =  0.43-29.el10)"

URI_perl-Test-Exception-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Exception-tests-0.43-29.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Exception-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Carp) ( ) perl(base) ( ) perl(overload) ( ) perl(Test::Builder) ( ) perl(Test::Builder::Tester) ( ) perl(Test::Harness) ( ) perl(Test::Exception) ( ) perl(Sub::Uplevel) ( ) perl-Test-Exception ( =  0.43-29.el10)"
RPROVIDES:perl-Test-Exception-tests = "perl-Test-Exception-tests ( =  0.43-29.el10)"
