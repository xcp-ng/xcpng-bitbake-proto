
PN = "perl-Module-Manifest-Skip"
PE = "0"
PV = "0.23"
PR = "32.el10"
PACKAGES = "perl-Module-Manifest-Skip perl-Module-Manifest-Skip-tests"


URI_perl-Module-Manifest-Skip = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Manifest-Skip-0.23-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Manifest-Skip = " \
 perl-File-ShareDir \
 perl-PathTools \
 perl-libs \
 perl-Moo \
"

URI_perl-Module-Manifest-Skip-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Manifest-Skip-tests-0.23-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Manifest-Skip-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Module-Manifest-Skip \
 bash \
 perl-base \
 perl-PathTools \
 coreutils \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
