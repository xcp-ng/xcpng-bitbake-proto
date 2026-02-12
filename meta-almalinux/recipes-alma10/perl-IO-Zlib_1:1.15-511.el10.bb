
inherit dnf-bridge

PN = "perl-IO-Zlib"
PE = "1"
PV = "1.15"
PR = "511.el10"
PACKAGES = "perl-IO-Zlib perl-IO-Zlib-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-IO-Zlib-1.15-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-IO-Zlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-Zlib-1.15-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IO-Zlib}"
RDEPENDS:perl-IO-Zlib = " \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-IO-Compress \
 gzip \
 perl-Fcntl \
 perl-Symbol \
 perl-Tie \
"

URI_perl-IO-Zlib-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Zlib-tests-1.15-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IO-Zlib-tests}"
RDEPENDS:perl-IO-Zlib-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-IO-Compress \
 perl-IO-Zlib \
 bash \
 perl-interpreter \
"
