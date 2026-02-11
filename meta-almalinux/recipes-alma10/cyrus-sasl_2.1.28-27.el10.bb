
inherit dnf-bridge

PN = "cyrus-sasl"
PE = "0"
PV = "2.1.28"
PR = "27.el10"
PACKAGES = "cyrus-sasl cyrus-sasl-gssapi cyrus-sasl-lib cyrus-sasl-plain cyrus-sasl-scram cyrus-sasl-devel cyrus-sasl-gs2 cyrus-sasl-ldap cyrus-sasl-md5 cyrus-sasl-sql"


URI_cyrus-sasl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl = " \
 shadow-utils \
 util-linux \
 libxcrypt \
 openssl-libs \
 gdbm-libs \
 pam-libs \
 krb5-libs \
 cyrus-sasl-lib \
 bash \
 glibc \
 openldap \
"

URI_cyrus-sasl-gssapi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-gssapi-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-gssapi = " \
 libxcrypt \
 krb5-libs \
 cyrus-sasl-lib \
 libcom_err \
 glibc \
"

URI_cyrus-sasl-lib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-lib-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-lib = " \
 glibc \
 libxcrypt \
 gdbm-libs \
"

URI_cyrus-sasl-plain = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-plain-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-plain = " \
 glibc \
 libxcrypt \
 cyrus-sasl-lib \
"

URI_cyrus-sasl-scram = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-scram-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-scram = " \
 glibc \
 libxcrypt \
 cyrus-sasl-lib \
 openssl-libs \
"

URI_cyrus-sasl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-devel-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-devel = " \
 pkgconf-pkg-config \
 cyrus-sasl \
 krb5-libs \
 cyrus-sasl-lib \
 glibc \
"

URI_cyrus-sasl-gs2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-gs2-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-gs2 = " \
 libxcrypt \
 cyrus-sasl-lib \
 krb5-libs \
 libcom_err \
 glibc \
"

URI_cyrus-sasl-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-ldap-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-ldap = " \
 glibc \
 libxcrypt \
 cyrus-sasl-lib \
 openldap \
"

URI_cyrus-sasl-md5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-md5-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-md5 = " \
 glibc \
 libxcrypt \
 cyrus-sasl-lib \
 openssl-libs \
"

URI_cyrus-sasl-sql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-sql-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-sql = " \
 libpq \
 libxcrypt \
 cyrus-sasl-lib \
 mariadb-connector-c \
 glibc \
"
