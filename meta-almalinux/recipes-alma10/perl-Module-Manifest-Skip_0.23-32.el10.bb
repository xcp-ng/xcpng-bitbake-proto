
PN = "perl-Module-Manifest-Skip"
PE = "0"
PV = "0.23"
PR = "32.el10"
PACKAGES = "perl-Module-Manifest-Skip perl-Module-Manifest-Skip-tests"


URI_perl-Module-Manifest-Skip = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Manifest-Skip-0.23-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Manifest-Skip = "perl(strict) ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl-libs ( ) perl(File::ShareDir) ( ) perl(Moo) ( >=  0.091013)"
RPROVIDES:perl-Module-Manifest-Skip = "perl-Module-Manifest-Skip ( =  0.23-32.el10) perl(Module::Manifest::Skip) ( =  0.23)"

URI_perl-Module-Manifest-Skip-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Manifest-Skip-tests-0.23-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Manifest-Skip-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(lib) ( ) perl(Exporter) ( ) perl(base) ( ) perl(Cwd) ( ) coreutils ( ) perl(Module::Manifest::Skip) ( ) perl-Module-Manifest-Skip ( =  0.23-32.el10)"
RPROVIDES:perl-Module-Manifest-Skip-tests = "perl-Module-Manifest-Skip-tests ( =  0.23-32.el10)"
