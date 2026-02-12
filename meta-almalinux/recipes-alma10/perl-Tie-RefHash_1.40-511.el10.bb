
inherit dnf-bridge

PN = "perl-Tie-RefHash"
PE = "0"
PV = "1.40"
PR = "511.el10"
PACKAGES = "perl-Tie-RefHash perl-Tie-RefHash-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Tie-RefHash-1.40-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Tie-RefHash = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Tie-RefHash-1.40-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Tie-RefHash}"
RDEPENDS:perl-Tie-RefHash = " \
 perl-overload \
 perl-libs \
 perl-Carp \
"

URI_perl-Tie-RefHash-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Tie-RefHash-tests-1.40-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Tie-RefHash-tests}"
RDEPENDS:perl-Tie-RefHash-tests = " \
 perl-threads \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-Storable \
 perl-overload \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-Tie-RefHash \
 perl-Data-Dumper \
"
