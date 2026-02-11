
PN = "swtpm"
PE = "0"
PV = "0.9.0"
PR = "5.el10"
PACKAGES = "swtpm swtpm-libs swtpm-selinux swtpm-tools swtpm-devel swtpm-tools-pkcs11"


URI_swtpm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/swtpm-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm = "
 glibc
 swtpm-libs
 swtpm-selinux
 libtpms
"

URI_swtpm-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/swtpm-libs-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm-libs = "
 libtpms
 openssl-libs
 glib2
 libseccomp
 glibc
"

URI_swtpm-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/swtpm-selinux-0.9.0-5.el10.noarch.rpm;unpack=0"
RDEPENDS:swtpm-selinux = "
 policycoreutils-python-utils
 policycoreutils
 bash
 selinux-policy
 libselinux-utils
 swtpm
"

URI_swtpm-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/swtpm-tools-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm-tools = "
 gmp
 gnutls
 openssl-libs
 libgcc
 json-glib
 gnutls-utils
 bash
 glib2
 libtasn1
 tpm2-tss
 glibc
 swtpm
"

URI_swtpm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/swtpm-devel-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm-devel = "
 swtpm-libs
"

URI_swtpm-tools-pkcs11 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/swtpm-tools-pkcs11-0.9.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swtpm-tools-pkcs11 = "
 swtpm-tools
 gnutls-utils
 expect
 bash
 tpm2-tools
 tpm2-abrmd
 tpm2-pkcs11
 tpm2-pkcs11-tools
"
