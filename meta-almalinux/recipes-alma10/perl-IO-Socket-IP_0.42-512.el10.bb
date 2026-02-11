
PN = "perl-IO-Socket-IP"
PE = "0"
PV = "0.42"
PR = "512.el10"
PACKAGES = "perl-IO-Socket-IP perl-IO-Socket-IP-tests"


URI_perl-IO-Socket-IP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-Socket-IP-0.42-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Socket-IP = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-Socket \
 perl-POSIX \
 perl-Errno \
 perl-base \
"

URI_perl-IO-Socket-IP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Socket-IP-tests-0.42-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Socket-IP-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-IO \
 perl-Socket \
 perl-IO-Socket-IP \
 bash \
 perl-Errno \
 perl-interpreter \
 perl-base \
"
