
PN = "gnupg2"
PE = "0"
PV = "2.4.5"
PR = "2.el10"
PACKAGES = "gnupg2 gnupg2-smime"


URI_gnupg2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gnupg2-2.4.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnupg2 = "
 zlib-ng-compat
 libksba
 gnutls
 bzip2-libs
 libassuan
 npth
 readline
 libgcrypt
 libgpg-error
 sqlite-libs
 bash
 tpm2-tss
 glibc
 openldap
"

URI_gnupg2-smime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnupg2-smime-2.4.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnupg2-smime = "
 gnupg2
 libksba
 npth
 libassuan
 readline
 libgcrypt
 libgpg-error
 glibc
"
