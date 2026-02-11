
PN = "perl-threads"
PE = "1"
PV = "2.40"
PR = "511.el10"
PACKAGES = "perl-threads perl-threads-tests"


URI_perl-threads = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-threads-2.40-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-threads = " \
 glibc \
 perl-overload \
 perl-libs \
 perl-Carp \
"

URI_perl-threads-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-threads-tests-2.40-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-threads-tests = " \
 perl-threads \
 perl-threads-shared \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-IO \
 perl-Thread-Queue \
 bash \
 perl-PathTools \
 perl-Thread-Semaphore \
 procps-ng \
 perl-interpreter \
 perl-File-Path \
 perl-Data-Dumper \
 perl-Hash-Util \
"
