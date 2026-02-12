
inherit dnf-bridge

PN = "perl-String-ShellQuote"
PE = "0"
PV = "1.04"
PR = "45.el10"
PACKAGES = "perl-String-ShellQuote perl-String-ShellQuote-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-String-ShellQuote-1.04-45.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-String-ShellQuote = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-String-ShellQuote-1.04-45.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-String-ShellQuote}"
RDEPENDS:perl-String-ShellQuote = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-interpreter \
 perl-Getopt-Long \
 perl-String-ShellQuote \
 perl-Exporter \
"

URI_perl-String-ShellQuote-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-String-ShellQuote-tests-1.04-45.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-String-ShellQuote-tests}"
RDEPENDS:perl-String-ShellQuote-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-String-ShellQuote \
 bash \
 perl-interpreter \
"
