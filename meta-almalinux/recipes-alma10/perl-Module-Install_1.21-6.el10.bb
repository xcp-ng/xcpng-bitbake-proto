
inherit dnf-bridge

PN = "perl-Module-Install"
PE = "0"
PV = "1.21"
PR = "6.el10"
PACKAGES = "perl-Module-Install perl-Module-Install-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Module-Install-1.21-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Module-Install = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Module-Install-1.21-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Module-Install}"
RDEPENDS:perl-Module-Install = " \
 perl-libs \
 perl-FileHandle \
 perl-Module-Install \
 perl-FindBin \
 perl-Socket \
 perl-Module-ScanDeps \
 perl-Archive-Zip \
 perl-CPAN \
 perl-CPAN-Meta \
 perl-Carp \
 perl-vars \
 perl-YAML-Tiny \
 perl-Devel-PPPort \
 perl-Module-Build \
 perl-Module-CoreList \
 perl-ExtUtils-MakeMaker \
 perl-ExtUtils-Manifest \
 perl-Fcntl \
 perl-File-Basename \
 perl-PathTools \
 perl-File-Find \
 perl-File-Path \
 perl-File-Remove \
 perl-File-Temp \
"

URI_perl-Module-Install-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Install-tests-1.21-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Module-Install-tests}"
RDEPENDS:perl-Module-Install-tests = " \
 perl-CPAN-Meta \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-ExtUtils-MakeMaker \
 perl-Module-Install \
 perl-File-Temp \
 perl-Symbol \
 bash \
 perl-PathTools \
 perl-autodie \
 perl-interpreter \
 perl-File-Path \
 perl-lib \
"
