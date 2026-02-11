
inherit dnf-bridge

PN = "perl-Pod-Markdown"
PE = "0"
PV = "3.400"
PR = "6.el10"
PACKAGES = "perl-Pod-Markdown perl-Pod-Markdown-tests"


URI_perl-Pod-Markdown = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Pod-Markdown-3.400-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Markdown = " \
 perl-libs \
 perl-URI \
 perl-Getopt-Long \
 perl-Encode \
 perl-Pod-Markdown \
 perl-parent \
 perl-interpreter \
 perl-Pod-Simple \
 perl-Pod-Usage \
"

URI_perl-Pod-Markdown-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Markdown-tests-3.400-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Markdown-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-Test-Simple \
 perl-IO \
 perl-Getopt-Long \
 perl-Pod-Markdown \
 perl-File-Temp \
 perl-Symbol \
 perl-PathTools \
 bash \
 perl-IPC-Open3 \
 perl-interpreter \
 perl-Test-Differences \
 perl-Exporter \
 perl-lib \
 perl-Pod-Usage \
"
