
inherit dnf-bridge

PN = "perl-NTLM"
PE = "0"
PV = "1.09"
PR = "41.el10"
PACKAGES = "perl-NTLM perl-NTLM-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-NTLM-1.09-41.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-NTLM = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-NTLM-1.09-41.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-NTLM}"
RDEPENDS:perl-NTLM = " \
 perl-constant \
 perl-libs \
 perl-vars \
 perl-Digest-HMAC \
 perl-NTLM \
 perl-Exporter \
 perl-MIME-Base64 \
"

URI_perl-NTLM-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-NTLM-tests-1.09-41.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-NTLM-tests}"
RDEPENDS:perl-NTLM-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-NTLM \
 perl-interpreter \
 perl-MIME-Base64 \
"
