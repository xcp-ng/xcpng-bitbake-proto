
inherit dnf-bridge

PN = "perl-ExtUtils-Manifest"
PE = "1"
PV = "1.75"
PR = "511.el10"
PACKAGES = "perl-ExtUtils-Manifest perl-ExtUtils-Manifest-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-ExtUtils-Manifest-1.75-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-ExtUtils-Manifest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-Manifest-1.75-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-ExtUtils-Manifest}"
RDEPENDS:perl-ExtUtils-Manifest = " \
 perl-libs \
 perl-Carp \
 perl-File-Basename \
 perl-File-Copy \
 perl-PathTools \
 perl-File-Find \
 perl-Exporter \
 perl-File-Path \
"

URI_perl-ExtUtils-Manifest-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-Manifest-tests-1.75-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-ExtUtils-Manifest-tests}"
RDEPENDS:perl-ExtUtils-Manifest-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-ExtUtils-Manifest \
 bash \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
"
