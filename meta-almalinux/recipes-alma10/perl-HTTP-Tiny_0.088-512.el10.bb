
PN = "perl-HTTP-Tiny"
PE = "0"
PV = "0.088"
PR = "512.el10"
PACKAGES = "perl-HTTP-Tiny perl-HTTP-Tiny-tests"


URI_perl-HTTP-Tiny = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTTP-Tiny-0.088-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Tiny = " \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-Socket \
 perl-Fcntl \
 perl-IO-Socket-SSL \
 perl-Mozilla-CA \
 perl-Errno \
 perl-Net-SSLeay \
 perl-Time-Local \
 perl-MIME-Base64 \
"

URI_perl-HTTP-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Tiny-tests-0.088-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Tiny-tests = " \
 perl-libs \
 perl-open \
 perl-HTTP-Tiny \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-IO \
 perl-IO-Socket-IP \
 perl-IO-Socket-SSL \
 perl-IPC-Cmd \
 perl-lib \
 openssl \
 perl-Mozilla-CA \
 bash \
 perl-Net-SSLeay \
 perl-ExtUtils-MakeMaker \
 perl-File-Basename \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"
