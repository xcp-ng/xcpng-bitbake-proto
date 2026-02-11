
inherit dnf-bridge

PN = "perl-Compress-Raw-Bzip2"
PE = "0"
PV = "2.212"
PR = "512.el10"
PACKAGES = "perl-Compress-Raw-Bzip2 perl-Compress-Raw-Bzip2-tests"


URI_perl-Compress-Raw-Bzip2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Compress-Raw-Bzip2-2.212-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Bzip2 = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 bzip2-libs \
 glibc \
 perl-Exporter \
"

URI_perl-Compress-Raw-Bzip2-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Compress-Raw-Bzip2-tests-2.212-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Bzip2-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-Compress-Raw-Bzip2 \
 bash \
 perl-interpreter \
 perl-File-Path \
 perl-lib \
"
