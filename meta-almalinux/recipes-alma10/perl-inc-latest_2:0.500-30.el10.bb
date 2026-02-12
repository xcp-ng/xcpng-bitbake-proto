
inherit dnf-bridge

PN = "perl-inc-latest"
PE = "2"
PV = "0.500"
PR = "30.el10"
PACKAGES = "perl-inc-latest perl-inc-latest-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-inc-latest-0.500-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-inc-latest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-inc-latest-0.500-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-inc-latest}"
RDEPENDS:perl-inc-latest = " \
 perl-ExtUtils-Install \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-File-Basename \
 perl-File-Copy \
 perl-PathTools \
 perl-File-Path \
"

URI_perl-inc-latest-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-inc-latest-tests-0.500-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-inc-latest-tests}"
RDEPENDS:perl-inc-latest-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 bash \
 perl-PathTools \
 perl-inc-latest \
 perl-interpreter \
"
