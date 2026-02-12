
inherit dnf-bridge

PN = "perl-DBI"
PE = "0"
PV = "1.643"
PR = "26.el10"
PACKAGES = "perl-DBI perl-DBI-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-DBI-1.643-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-DBI = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-DBI-1.643-26.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-DBI}"
RDEPENDS:perl-DBI = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-FileHandle \
 perl-Storable \
 perl-Getopt-Long \
 perl-Symbol \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-IPC-Open3 \
 perl-DBI \
 perl-Data-Dumper \
 perl-Math-BigInt \
 perl-DynaLoader \
 perl-Errno \
 perl-Exporter \
 perl-base \
 perl-constant \
 perl-Fcntl \
 perl-File-Basename \
 perl-PathTools \
 glibc \
 perl-interpreter \
"

URI_perl-DBI-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-DBI-tests-1.643-26.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-DBI-tests}"
RDEPENDS:perl-DBI-tests = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Storable \
 perl-Getopt-Long \
 perl-overload \
 perl-Symbol \
 perl-B \
 perl-Benchmark \
 perl-threads \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-vars \
 perl-DBI \
 perl-Data-Dumper \
 bash \
 perl-base \
 perl-constant \
 perl-File-Basename \
 perl-File-Copy \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
"
