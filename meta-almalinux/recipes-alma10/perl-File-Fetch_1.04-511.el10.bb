
PN = "perl-File-Fetch"
PE = "0"
PV = "1.04"
PR = "511.el10"
PACKAGES = "perl-File-Fetch perl-File-Fetch-tests"


URI_perl-File-Fetch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Fetch-1.04-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Fetch = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-FileHandle \
 perl-Module-Load-Conditional \
 perl-File-Basename \
 perl-IPC-Cmd \
 perl-Params-Check \
 perl-File-Copy \
 perl-PathTools \
 perl-Locale-Maketext-Simple \
 perl-File-Path \
 perl-File-Temp \
"

URI_perl-File-Fetch-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Fetch-tests-1.04-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Fetch-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-IO \
 perl-File-Basename \
 bash \
 perl-PathTools \
 perl-File-Fetch \
 perl-interpreter \
 perl-File-Path \
 perl-Data-Dumper \
 perl-lib \
"
