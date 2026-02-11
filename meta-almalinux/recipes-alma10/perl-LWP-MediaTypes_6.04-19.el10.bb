
PN = "perl-LWP-MediaTypes"
PE = "0"
PV = "6.04"
PR = "19.el10"
PACKAGES = "perl-LWP-MediaTypes perl-LWP-MediaTypes-tests"


URI_perl-LWP-MediaTypes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-LWP-MediaTypes-6.04-19.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-LWP-MediaTypes = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(File::Basename) ( ) perl(Scalar::Util) ( ) mailcap ( )"
RPROVIDES:perl-LWP-MediaTypes = "perl(LWP::MediaTypes) ( =  6.04) perl-LWP-MediaTypes ( =  6.04-19.el10)"

URI_perl-LWP-MediaTypes-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-LWP-MediaTypes-tests-6.04-19.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-LWP-MediaTypes-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(overload) ( ) perl(Test::Fatal) ( ) perl(LWP::MediaTypes) ( ) perl-LWP-MediaTypes ( =  6.04-19.el10)"
RPROVIDES:perl-LWP-MediaTypes-tests = "perl-LWP-MediaTypes-tests ( =  6.04-19.el10)"
