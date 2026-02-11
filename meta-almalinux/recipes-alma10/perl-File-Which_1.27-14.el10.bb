
PN = "perl-File-Which"
PE = "0"
PV = "1.27"
PR = "14.el10"
PACKAGES = "perl-File-Which perl-File-Which-tests"


URI_perl-File-Which = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Which-1.27-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Which = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(base) ( ) perl(File::Spec) ( >=  0.60)"
RPROVIDES:perl-File-Which = "perl(File::Which) ( =  1.27) perl-File-Which ( =  1.27-14.el10)"

URI_perl-File-Which-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Which-tests-1.27-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Which-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(Env) ( ) perl(File::Which) ( ) perl-File-Which ( =  1.27-14.el10)"
RPROVIDES:perl-File-Which-tests = "perl-File-Which-tests ( =  1.27-14.el10)"
