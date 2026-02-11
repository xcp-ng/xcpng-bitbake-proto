
inherit dnf-bridge

PN = "perl-Net-Ping"
PE = "0"
PV = "2.76"
PR = "511.el10"
PACKAGES = "perl-Net-Ping perl-Net-Ping-tests"


URI_perl-Net-Ping = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-Ping-2.76-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-Ping = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-FileHandle \
 perl-IO \
 perl-Socket \
 perl-Fcntl \
 perl-POSIX \
 perl-Exporter \
 perl-Time-HiRes \
"

URI_perl-Net-Ping-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-Ping-tests-2.76-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-Ping-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-IO \
 perl-Socket \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-Net-Ping \
"
