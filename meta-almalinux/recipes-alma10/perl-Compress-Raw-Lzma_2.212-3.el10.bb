
inherit dnf-bridge

PN = "perl-Compress-Raw-Lzma"
PE = "0"
PV = "2.212"
PR = "3.el10"
PACKAGES = "perl-Compress-Raw-Lzma perl-Compress-Raw-Lzma-tests"


URI_perl-Compress-Raw-Lzma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Compress-Raw-Lzma-2.212-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Lzma = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-AutoLoader \
 glibc \
 perl-Exporter \
 xz-libs \
"

URI_perl-Compress-Raw-Lzma-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Compress-Raw-Lzma-tests-2.212-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Lzma-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-Compress-Raw-Lzma \
 bash \
 perl-interpreter \
 perl-File-Path \
 perl-lib \
"
