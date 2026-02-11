
PN = "perl-Pod-Coverage"
PE = "0"
PV = "0.23"
PR = "36.el10"
PACKAGES = "perl-Pod-Coverage perl-Pod-Coverage-tests"


URI_perl-Pod-Coverage = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Pod-Coverage-0.23-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Coverage = "perl(strict) ( ) perl-libs ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(base) ( ) perl(constant) ( ) perl(B) ( ) perl(Pod::Coverage) ( ) perl(Devel::Symdump) ( >=  2.01) perl(Pod::Find) ( >=  0.21) perl(Pod::Parser) ( >=  1.13)"
RPROVIDES:perl-Pod-Coverage = "perl(Pod::Coverage::CountParents) ( ) perl(Pod::Coverage::ExportOnly) ( ) perl(Pod::Coverage::Extractor) ( ) perl(Pod::Coverage::Overloader) ( ) perl(Pod::Coverage) ( =  0.23) perl-Pod-Coverage ( =  0.23-36.el10)"

URI_perl-Pod-Coverage-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Coverage-tests-0.23-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Coverage-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(base) ( ) perl(Pod::Coverage) ( ) perl-Pod-Coverage ( =  0.23-36.el10)"
RPROVIDES:perl-Pod-Coverage-tests = "perl-Pod-Coverage-tests ( =  0.23-36.el10)"
