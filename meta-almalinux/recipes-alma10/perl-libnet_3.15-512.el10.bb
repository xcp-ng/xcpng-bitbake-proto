
PN = "perl-libnet"
PE = "0"
PV = "3.15"
PR = "512.el10"
PACKAGES = "perl-libnet perl-libnet-tests"


URI_perl-libnet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-libnet-3.15-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-libnet = " \
 perl-libnet \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-FileHandle \
 perl-IO \
 perl-Digest-MD5 \
 perl-Socket \
 perl-Fcntl \
 perl-IO-Socket-IP \
 perl-POSIX \
 perl-File-Basename \
 perl-Symbol \
 perl-Errno \
 perl-Exporter \
 perl-Time-Local \
"

URI_perl-libnet-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-libnet-tests-3.15-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-libnet-tests = " \
 perl-libnet \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-IO \
 perl-IO-Socket-SSL \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"
