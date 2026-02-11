
PN = "perl-Compress-Bzip2"
PE = "0"
PV = "2.28"
PR = "21.el10"
PACKAGES = "perl-Compress-Bzip2 perl-Compress-Bzip2-tests"


URI_perl-Compress-Bzip2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Compress-Bzip2-2.28-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Bzip2 = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 bzip2-libs \
 perl-Fcntl \
 perl-Getopt-Std \
 perl-AutoLoader \
 glibc \
 perl-Exporter \
"

URI_perl-Compress-Bzip2-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Compress-Bzip2-tests-2.28-21.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Compress-Bzip2-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bzip2 \
 perl-Compress-Bzip2 \
 perl-Fcntl \
 perl-File-Copy \
 bash \
 perl-PathTools \
 coreutils \
 perl-interpreter \
"
