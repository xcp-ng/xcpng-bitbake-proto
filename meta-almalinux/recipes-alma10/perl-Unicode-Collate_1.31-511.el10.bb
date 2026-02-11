
PN = "perl-Unicode-Collate"
PE = "0"
PV = "1.31"
PR = "511.el10"
PACKAGES = "perl-Unicode-Collate perl-Unicode-Collate-tests"


URI_perl-Unicode-Collate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Unicode-Collate-1.31-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-Collate = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-Unicode-Collate \
 perl-Unicode-Normalize \
 perl-PathTools \
 glibc \
 perl-base \
"

URI_perl-Unicode-Collate-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Unicode-Collate-tests-1.31-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-Collate-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Unicode-Collate \
 bash \
 perl-interpreter \
"
