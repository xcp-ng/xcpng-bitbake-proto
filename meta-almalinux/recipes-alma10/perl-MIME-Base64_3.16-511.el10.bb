
inherit dnf-bridge

PN = "perl-MIME-Base64"
PE = "0"
PV = "3.16"
PR = "511.el10"
PACKAGES = "perl-MIME-Base64 perl-MIME-Base64-tests"


URI_perl-MIME-Base64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-MIME-Base64-3.16-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-MIME-Base64 = " \
 glibc \
 perl-Exporter \
 perl-libs \
 perl-MIME-Base64 \
"

URI_perl-MIME-Base64-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-MIME-Base64-tests-3.16-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-MIME-Base64-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-MIME-Base64 \
"
