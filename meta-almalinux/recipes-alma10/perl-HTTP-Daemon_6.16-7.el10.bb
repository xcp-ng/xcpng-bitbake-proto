
inherit dnf-bridge

PN = "perl-HTTP-Daemon"
PE = "0"
PV = "6.16"
PR = "7.el10"
PACKAGES = "perl-HTTP-Daemon perl-HTTP-Daemon-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-HTTP-Daemon-6.16-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-HTTP-Daemon = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-HTTP-Daemon-6.16-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-HTTP-Daemon}"
RDEPENDS:perl-HTTP-Daemon = " \
 perl-libs \
 perl-Carp \
 perl-Socket \
 perl-IO-Socket-IP \
 perl-LWP-MediaTypes \
 perl-HTTP-Date \
 perl-HTTP-Message \
"

URI_perl-HTTP-Daemon-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Daemon-tests-6.16-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-HTTP-Daemon-tests}"
RDEPENDS:perl-HTTP-Daemon-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-libwww-perl \
 perl-Test-Simple \
 perl-IO \
 perl-Socket \
 perl-Module-Metadata \
 perl-File-Temp \
 perl-PathTools \
 bash \
 perl-Test-Needs \
 perl-interpreter \
 perl-HTTP-Daemon \
 perl-lib \
 perl-MIME-Base64 \
"
