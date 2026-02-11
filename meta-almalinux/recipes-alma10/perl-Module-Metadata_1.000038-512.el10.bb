
inherit dnf-bridge

PN = "perl-Module-Metadata"
PE = "0"
PV = "1.000038"
PR = "512.el10"
PACKAGES = "perl-Module-Metadata perl-Module-Metadata-tests"


URI_perl-Module-Metadata = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-Metadata-1.000038-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Metadata = " \
 perl-libs \
 perl-Carp \
 perl-version \
 perl-Fcntl \
 perl-Encode \
 perl-PathTools \
 perl-File-Find \
"

URI_perl-Module-Metadata-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Metadata-tests-1.000038-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Metadata-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Carp \
 perl-Test-Simple \
 perl-IO \
 perl-File-Basename \
 perl-Encode \
 perl-File-Temp \
 perl-Module-Metadata \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-File-Path \
 perl-lib \
"
