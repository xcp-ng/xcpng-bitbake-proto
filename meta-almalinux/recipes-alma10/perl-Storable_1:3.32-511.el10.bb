
PN = "perl-Storable"
PE = "1"
PV = "3.32"
PR = "511.el10"
PACKAGES = "perl-Storable perl-Storable-tests"


URI_perl-Storable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Storable-3.32-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Storable = " \
 perl-libs \
 perl-Carp \
 perl-IO \
 perl-Fcntl \
 glibc \
 perl-Exporter \
"

URI_perl-Storable-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Storable-tests-3.32-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Storable-tests = " \
 perl-Safe \
 perl-libs \
 perl-Storable \
 perl-overload \
 perl-Symbol \
 perl-B \
 perl-Hash-Util \
 perl-threads \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-Tie \
 perl-Digest-MD5 \
 bash \
 perl-base \
 perl-constant \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"
