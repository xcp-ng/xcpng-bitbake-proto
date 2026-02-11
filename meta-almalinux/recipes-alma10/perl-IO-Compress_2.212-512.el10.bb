
PN = "perl-IO-Compress"
PE = "0"
PV = "2.212"
PR = "512.el10"
PACKAGES = "perl-IO-Compress perl-IO-Compress-tests"


URI_perl-IO-Compress = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-Compress-2.212-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Compress = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-IO \
 perl-IO-Compress \
 perl-Compress-Raw-Bzip2 \
 perl-Fcntl \
 perl-Compress-Raw-Zlib \
 perl-Getopt-Long \
 perl-Encode \
 perl-Symbol \
 perl-PathTools \
 perl-parent \
 perl-Exporter \
 perl-Data-Dumper \
 perl-Time-Local \
"

URI_perl-IO-Compress-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Compress-tests-2.212-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Compress-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-IO \
 perl-IO-Compress \
 perl-Compress-Raw-Zlib \
 perl-Symbol \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
 perl-Data-Dumper \
 perl-lib \
"
