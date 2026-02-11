
PN = "perl-perlfaq"
PE = "0"
PV = "5.20240218"
PR = "511.el10"
PACKAGES = "perl-perlfaq perl-perlfaq-tests"


URI_perl-perlfaq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-perlfaq-5.20240218-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-perlfaq = " \
 perl-libs \
"

URI_perl-perlfaq-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-perlfaq-tests-5.20240218-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-perlfaq-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-IO \
 perl-IPC-Open3 \
 bash \
 perl-PathTools \
 perl-perlfaq \
 perl-interpreter \
"
