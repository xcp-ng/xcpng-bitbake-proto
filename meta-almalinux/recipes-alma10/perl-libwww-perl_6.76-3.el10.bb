
inherit dnf-bridge

PN = "perl-libwww-perl"
PE = "0"
PV = "6.76"
PR = "3.el10"
PACKAGES = "perl-libwww-perl perl-libwww-perl-tests"


URI_perl-libwww-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-libwww-perl-6.76-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-libwww-perl = " \
 perl-libnet \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-libwww-perl \
 perl-Getopt-Long \
 perl-parent \
 perl-HTML-Parser \
 perl-HTTP-Cookies \
 perl-HTTP-Date \
 perl-HTTP-Message \
 perl-HTTP-Negotiate \
 perl-File-Listing \
 perl-Carp \
 perl-IO \
 perl-LWP-MediaTypes \
 perl-Data-Dump \
 perl-MIME-Base64 \
 perl-Try-Tiny \
 perl-URI \
 perl-Digest-MD5 \
 perl-Module-Load \
 perl-WWW-RobotRules \
 perl-Encode \
 perl-Encode-Locale \
 perl-NTLM \
 perl-Exporter \
 perl-Net-HTTP \
 perl-Fcntl \
 perl-File-Copy \
 perl-PathTools \
 perl-interpreter \
"

URI_perl-libwww-perl-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-libwww-perl-tests-6.76-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-libwww-perl-tests = " \
 perl-libs \
 perl-libwww-perl \
 perl-FindBin \
 perl-HTTP-CookieJar \
 perl-parent \
 perl-HTTP-Cookies \
 perl-HTTP-Message \
 perl-Test-Fatal \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-IO \
 perl-URI \
 bash \
 perl-Net-HTTP \
 perl-ExtUtils-MakeMaker \
 perl-PathTools \
 coreutils \
 perl-interpreter \
 perl-HTTP-Daemon \
 perl-File-Temp \
"
