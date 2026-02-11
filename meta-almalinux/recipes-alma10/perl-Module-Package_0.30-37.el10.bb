
PN = "perl-Module-Package"
PE = "0"
PV = "0.30"
PR = "37.el10"
PACKAGES = "perl-Module-Package perl-Module-Package-tests"


URI_perl-Module-Package = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Package-0.30-37.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Package = " \
 perl-Module-Install-ManifestSkip \
 perl-libs \
 perl-vars \
 perl-Module-Install \
 perl-Module-Package \
 perl-Moo \
 perl-overload \
 perl-PathTools \
 perl-File-Find \
 perl-File-Path \
 perl-Data-Dumper \
 perl-Module-Install-AuthorRequires \
 perl-IO-All \
"

URI_perl-Module-Package-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Package-tests-0.30-37.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Package-tests = " \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Module-Package \
 bash \
 perl-interpreter \
"
