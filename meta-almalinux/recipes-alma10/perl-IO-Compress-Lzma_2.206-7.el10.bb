
inherit dnf-bridge

PN = "perl-IO-Compress-Lzma"
PE = "0"
PV = "2.206"
PR = "7.el10"
PACKAGES = "perl-IO-Compress-Lzma perl-IO-Compress-Lzma-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-IO-Compress-Lzma-2.206-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-IO-Compress-Lzma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-Compress-Lzma-2.206-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IO-Compress-Lzma}"
RDEPENDS:perl-IO-Compress-Lzma = " \
 perl-constant \
 perl-libs \
 perl-IO-Compress \
 perl-IO-Compress-Lzma \
 perl-Compress-Raw-Lzma \
 perl-Compress-Raw-Zlib \
 perl-Exporter \
"

URI_perl-IO-Compress-Lzma-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Compress-Lzma-tests-2.206-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IO-Compress-Lzma-tests}"
RDEPENDS:perl-IO-Compress-Lzma-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-IO \
 perl-Scalar-List-Utils \
 perl-IO-Compress \
 perl-IO-Compress-Lzma \
 perl-Compress-Raw-Zlib \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
 perl-lib \
 perl-IO-String \
"
