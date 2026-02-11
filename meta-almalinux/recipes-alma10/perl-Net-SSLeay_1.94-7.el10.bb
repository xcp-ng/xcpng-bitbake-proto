
inherit dnf-bridge

PN = "perl-Net-SSLeay"
PE = "0"
PV = "1.94"
PR = "7.el10"
PACKAGES = "perl-Net-SSLeay perl-Net-SSLeay-tests"


URI_perl-Net-SSLeay = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-SSLeay-1.94-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Net-SSLeay = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Net-SSLeay \
 perl-Socket \
 openssl-libs \
 perl-Errno \
 perl-AutoLoader \
 glibc \
 perl-Exporter \
 perl-MIME-Base64 \
"

URI_perl-Net-SSLeay-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-SSLeay-tests-1.94-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Net-SSLeay-tests = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-SelectSaver \
 perl-FindBin \
 perl-Socket \
 perl-Storable \
 perl-Symbol \
 perl-threads \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-IO \
 bash \
 perl-English \
 perl-Exporter \
 perl-base \
 perl-Net-SSLeay \
 perl-File-Basename \
 perl-PathTools \
 perl-interpreter \
 perl-lib \
"
