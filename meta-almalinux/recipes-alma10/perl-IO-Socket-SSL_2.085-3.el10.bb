
inherit dnf-bridge

PN = "perl-IO-Socket-SSL"
PE = "0"
PV = "2.085"
PR = "3.el10"
PACKAGES = "perl-IO-Socket-SSL"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-IO-Socket-SSL-2.085-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-IO-Socket-SSL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-Socket-SSL-2.085-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-IO-Socket-SSL}"
RDEPENDS:perl-IO-Socket-SSL = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-URI \
 perl-Socket \
 openssl-libs \
 perl-IO-Socket-IP \
 perl-IO-Socket-SSL \
 perl-Errno \
 perl-Exporter \
 perl-HTTP-Tiny \
 perl-Net-SSLeay \
"
