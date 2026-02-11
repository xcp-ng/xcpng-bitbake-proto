
PN = "perl-Module-Install-ManifestSkip"
PE = "0"
PV = "0.24"
PR = "31.el10"
PACKAGES = "perl-Module-Install-ManifestSkip perl-Module-Install-ManifestSkip-tests"


URI_perl-Module-Install-ManifestSkip = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-ManifestSkip-0.24-31.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Install-ManifestSkip = "perl(strict) ( ) perl(warnings) ( ) perl-libs ( ) perl(base) ( ) perl(Module::Install::Base) ( ) perl(Module::Manifest::Skip) ( >=  0.18)"
RPROVIDES:perl-Module-Install-ManifestSkip = "perl-Module-Install-ManifestSkip ( =  0.24-31.el10) perl(Module::Install::ManifestSkip) ( =  0.24)"

URI_perl-Module-Install-ManifestSkip-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-ManifestSkip-tests-0.24-31.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Install-ManifestSkip-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl-Module-Install-ManifestSkip ( =  0.24-31.el10)"
RPROVIDES:perl-Module-Install-ManifestSkip-tests = "perl-Module-Install-ManifestSkip-tests ( =  0.24-31.el10)"
