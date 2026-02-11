
PN = "perl-Test-Differences"
PE = "0"
PV = "0.7100"
PR = "7.el10"
PACKAGES = "perl-Test-Differences perl-Test-Differences-tests"


URI_perl-Test-Differences = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Differences-0.7100-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Differences = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(constant) ( ) perl(Data::Dumper) ( ) perl(B::Deparse) ( ) perl(Text::Diff) ( ) perl(Text::Diff) ( >=  1.43)"
RPROVIDES:perl-Test-Differences = "perl(Test::Differences) ( =  0.71) perl-Test-Differences ( =  0.7100-7.el10)"

URI_perl-Test-Differences-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Differences-tests-0.7100-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Differences-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Data::Dumper) ( ) perl(Test) ( ) perl(Capture::Tiny) ( ) perl(Test::Differences) ( ) perl-Test-Differences ( =  0.7100-7.el10)"
RPROVIDES:perl-Test-Differences-tests = "perl-Test-Differences-tests ( =  0.7100-7.el10)"
