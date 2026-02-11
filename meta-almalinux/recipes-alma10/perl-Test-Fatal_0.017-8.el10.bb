
PN = "perl-Test-Fatal"
PE = "0"
PV = "0.017"
PR = "8.el10"
PACKAGES = "perl-Test-Fatal perl-Test-Fatal-tests"


URI_perl-Test-Fatal = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Fatal-0.017-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Fatal = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Test::Builder) ( ) perl(Exporter) ( >=  5.57) perl(Try::Tiny) ( >=  0.07)"
RPROVIDES:perl-Test-Fatal = "perl(Test::Fatal) ( =  0.017) perl-Test-Fatal ( =  0.017-8.el10)"

URI_perl-Test-Fatal-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Fatal-tests-0.017-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Fatal-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(overload) ( ) perl(ExtUtils::MakeMaker) ( ) perl(Test::Builder::Tester) ( ) perl(Test::Fatal) ( ) perl-Test-Fatal ( =  0.017-8.el10) perl(Try::Tiny) ( >=  0.07) perl(Test::More) ( >=  0.65)"
RPROVIDES:perl-Test-Fatal-tests = "perl-Test-Fatal-tests ( =  0.017-8.el10)"
