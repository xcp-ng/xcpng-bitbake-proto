
inherit dnf-bridge

PN = "perl-Net-HTTP"
PE = "0"
PV = "6.23"
PR = "6.el10"
PACKAGES = "perl-Net-HTTP perl-Net-HTTP-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Net-HTTP-6.23-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Net-HTTP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-HTTP-6.23-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Net-HTTP}"
RDEPENDS:perl-Net-HTTP = " \
 perl-libs \
 perl-URI \
 perl-Carp \
 perl-IO-Compress \
 perl-Compress-Raw-Zlib \
 perl-IO-Socket-IP \
 perl-IO-Socket-SSL \
 perl-Symbol \
 perl-Net-HTTP \
 perl-base \
"

URI_perl-Net-HTTP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-HTTP-tests-6.23-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Net-HTTP-tests}"
RDEPENDS:perl-Net-HTTP-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-IO \
 perl-Socket \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-Net-HTTP \
 perl-Data-Dumper \
 perl-base \
"
