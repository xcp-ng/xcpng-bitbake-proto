
PN = "perl-generators"
PE = "0"
PV = "1.16"
PR = "7.el10"
PACKAGES = "perl-generators perl-generators-tests"


URI_perl-generators = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-generators-1.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-generators = "/usr/bin/perl ( ) perl(File::Basename) ( ) perl-macros ( ) perl(Fedora::VSP) ( ) perl-interpreter ( >=  4:5.22.0-351)"
RPROVIDES:perl-generators = "perl-generators ( =  1.16-7.el10)"

URI_perl-generators-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-generators-tests-1.16-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-generators-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Test::Simple) ( ) perl-generators ( =  1.16-7.el10)"
RPROVIDES:perl-generators-tests = "perl-generators-tests ( =  1.16-7.el10)"
