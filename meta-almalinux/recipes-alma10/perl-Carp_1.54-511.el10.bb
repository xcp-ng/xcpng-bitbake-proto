
PN = "perl-Carp"
PE = "0"
PV = "1.54"
PR = "511.el10"
PACKAGES = "perl-Carp perl-Carp-tests"


URI_perl-Carp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Carp-1.54-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Carp = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( )"
RPROVIDES:perl-Carp = "perl(Carp) ( =  1.54) perl(Carp::Heavy) ( =  1.54) perl-Carp ( =  1.54-511.el10)"

URI_perl-Carp-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Carp-tests-1.54-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Carp-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(Carp) ( ) perl(Data::Dumper) ( ) perl(utf8) ( ) perl(overload) ( ) perl(IPC::Open3) ( ) perl(Carp::Heavy) ( ) perl-Carp ( =  1.54-511.el10)"
RPROVIDES:perl-Carp-tests = "perl-Carp-tests ( =  1.54-511.el10)"
