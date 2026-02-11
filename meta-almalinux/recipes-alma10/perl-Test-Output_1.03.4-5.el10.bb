
PN = "perl-Test-Output"
PE = "0"
PV = "1.03.4"
PR = "5.el10"
PACKAGES = "perl-Test-Output perl-Test-Output-tests"


URI_perl-Test-Output = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Output-1.03.4-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Output = "perl(strict) ( ) perl(warnings) ( ) perl(Exporter) ( ) perl-libs ( ) perl(Test::Builder) ( ) perl(Capture::Tiny) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-Test-Output = "perl-Test-Output ( =  1.03.4-5.el10) perl(Test::Output) ( =  1.034)"

URI_perl-Test-Output-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Output-tests-1.03.4-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Output-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Carp) ( ) perl(Test::Tester) ( ) perl(Test::Output) ( ) perl-Test-Output ( =  1.03.4-5.el10)"
RPROVIDES:perl-Test-Output-tests = "perl-Test-Output-tests ( =  1.03.4-5.el10)"
