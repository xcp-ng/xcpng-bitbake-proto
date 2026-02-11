
PN = "sssd"
PE = "0"
PV = "2.10.2"
PR = "3.el10_0.3"
PACKAGES = "libipa_hbac libsss_autofs libsss_certmap libsss_idmap libsss_nss_idmap libsss_sudo python3-libipa_hbac python3-libsss_nss_idmap python3-sss python3-sss-murmur python3-sssdconfig sssd sssd-ad sssd-client sssd-common sssd-common-pac sssd-dbus sssd-ipa sssd-kcm sssd-krb5 sssd-krb5-common sssd-ldap sssd-nfs-idmap sssd-passkey sssd-proxy sssd-tools sssd-winbind-idmap sssd-idp libsss_nss_idmap-devel libipa_hbac-devel libsss_certmap-devel libsss_idmap-devel"


URI_libipa_hbac = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libipa_hbac-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libipa_hbac = "
 glibc
 libunistring
"

URI_libsss_autofs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsss_autofs-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsss_autofs = "
 glibc
"

URI_libsss_certmap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsss_certmap-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsss_certmap = "
 glibc
 openssl-libs
 libtalloc
"

URI_libsss_idmap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsss_idmap-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsss_idmap = "
 glibc
"

URI_libsss_nss_idmap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsss_nss_idmap-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsss_nss_idmap = "
 glibc
"

URI_libsss_sudo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsss_sudo-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsss_sudo = "
 glibc
"

URI_python3-libipa_hbac = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libipa_hbac-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libipa_hbac = "
 glibc
 python3
 libipa_hbac
 libunistring
"

URI_python3-libsss_nss_idmap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libsss_nss_idmap-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libsss_nss_idmap = "
 glibc
 python3
 libsss_nss_idmap
"

URI_python3-sss = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-sss-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-sss = "
 python3
 systemd-libs
 libref_array
 dbus-libs
 libselinux
 libbasicobjects
 libcap
 libcollection
 libtalloc
 libtdb
 libtevent
 libdhash
 libunistring
 openssl-libs
 pcre2
 libini_config
 sssd-common
 libldb
 popt
 glibc
"

URI_python3-sss-murmur = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-sss-murmur-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-sss-murmur = "
 glibc
 python3
"

URI_python3-sssdconfig = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-sssdconfig-2.10.2-3.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:python3-sssdconfig = "
 python3
"

URI_sssd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd = "
 sssd-ipa
 shadow-utils
 sssd-krb5
 sssd-ldap
 sssd-proxy
 sssd-ad
 sssd-common
"

URI_sssd-ad = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-ad-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-ad = "
 systemd-libs
 keyutils-libs
 samba-client-libs
 krb5-libs
 libref_array
 cyrus-sasl-lib
 dbus-libs
 libselinux
 libsmbclient
 libbasicobjects
 libsss_certmap
 libcap
 libsss_idmap
 libcollection
 libcom_err
 libtalloc
 libtdb
 libtevent
 libdhash
 libunistring
 openldap
 openssl-libs
 pcre2
 libini_config
 sssd-common
 sssd-common-pac
 libldb
 sssd-krb5-common
 popt
 glibc
"

URI_sssd-client = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-client-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-client = "
 libsss_idmap
 pam-libs
 krb5-libs
 libsss_nss_idmap
 libcom_err
 bash
 glibc
 alternatives
"

URI_sssd-common = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-common-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-common = "
 systemd
 systemd-libs
 keyutils-libs
 krb5-libs
 libref_array
 dbus-libs
 libselinux
 libbasicobjects
 libsss_autofs
 libsss_certmap
 libcap
 libsss_idmap
 libcollection
 libcom_err
 libsss_sudo
 libtalloc
 libtdb
 libtevent
 libdhash
 openldap
 libunistring
 shadow-utils
 openssl-libs
 p11-kit
 pam-libs
 bash
 pcre2
 sssd-client
 libini_config
 glibc
 c-ares
 libldb
 sssd-nfs-idmap
 popt
 libnl3
 coreutils
"

URI_sssd-common-pac = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-common-pac-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-common-pac = "
 systemd-libs
 libldb
 samba-client-libs
 libtevent
 libsss_idmap
 popt
 libtalloc
 libtdb
 glibc
 libselinux
 sssd-common
"

URI_sssd-dbus = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-dbus-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-dbus = "
 systemd
 systemd-libs
 libldb
 libtevent
 bash
 libtalloc
 popt
 libtdb
 glibc
 libselinux
 libdhash
 sssd-common
 dbus-libs
"

URI_sssd-ipa = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-ipa-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-ipa = "
 systemd-libs
 keyutils-libs
 samba-client-libs
 krb5-libs
 libref_array
 dbus-libs
 libselinux
 libsemanage
 libbasicobjects
 libsss_certmap
 libcap
 libsss_idmap
 libcollection
 libcom_err
 libtalloc
 libtdb
 libtevent
 libdhash
 libunistring
 openldap
 openssl-libs
 pcre2
 libini_config
 sssd-common
 libipa_hbac
 sssd-common-pac
 libldb
 sssd-krb5-common
 popt
 glibc
"

URI_sssd-kcm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-kcm-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-kcm = "
 libuuid
 systemd
 systemd-libs
 libldb
 sssd-krb5-common
 libtevent
 krb5-libs
 bash
 libtalloc
 popt
 glibc
 libselinux
 libdhash
 sssd-common
"

URI_sssd-krb5 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-krb5-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-krb5 = "
 systemd-libs
 keyutils-libs
 krb5-libs
 libref_array
 dbus-libs
 libselinux
 libbasicobjects
 libcap
 libcollection
 libcom_err
 libtalloc
 libtdb
 libtevent
 libdhash
 libunistring
 openssl-libs
 pcre2
 libini_config
 sssd-common
 libldb
 sssd-krb5-common
 popt
 glibc
"

URI_sssd-krb5-common = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-krb5-common-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-krb5-common = "
 systemd-libs
 jansson
 libcap
 cyrus-sasl-gssapi
 krb5-libs
 popt
 libtalloc
 glibc
 sssd-common
"

URI_sssd-ldap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-ldap-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-ldap = "
 systemd-libs
 keyutils-libs
 krb5-libs
 libref_array
 dbus-libs
 libselinux
 libbasicobjects
 libsss_certmap
 libcap
 libsss_idmap
 libcollection
 libcom_err
 libtalloc
 libtdb
 libtevent
 libdhash
 libunistring
 openldap
 openssl-libs
 pcre2
 libini_config
 sssd-common
 libldb
 sssd-krb5-common
 popt
 glibc
"

URI_sssd-nfs-idmap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-nfs-idmap-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-nfs-idmap = "
 glibc
 libnfsidmap
"

URI_sssd-passkey = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-passkey-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-passkey = "
 jansson
 libfido2
 openssl-libs
 acl
 krb5-libs
 libcom_err
 popt
 libtalloc
 glibc
 sssd-common
"

URI_sssd-proxy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-proxy-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-proxy = "
 systemd-libs
 libref_array
 dbus-libs
 libselinux
 libbasicobjects
 libsss_certmap
 libcap
 libcollection
 libtalloc
 libtdb
 libtevent
 libdhash
 libunistring
 openssl-libs
 pam-libs
 pcre2
 libini_config
 sssd-common
 libldb
 popt
 glibc
"

URI_sssd-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-tools-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-tools = "
 python3
 sssd-dbus
 libldb
 libsss_certmap
 pam-libs
 libref_array
 bash
 popt
 libtalloc
 python3-sssdconfig
 glibc
 python3-sss
 libdhash
 python3-systemd
 sssd-common
"

URI_sssd-winbind-idmap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sssd-winbind-idmap-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-winbind-idmap = "
 glibc
 libsss_nss_idmap
 libtalloc
 libsss_idmap
"

URI_sssd-idp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sssd-idp-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:sssd-idp = "
 jansson
 krb5-libs
 libcom_err
 popt
 libtalloc
 libcurl
 glibc
 libjose
 sssd-common
"

URI_libsss_nss_idmap-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsss_nss_idmap-devel-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsss_nss_idmap-devel = "
 libsss_nss_idmap
 pkgconf-pkg-config
"

URI_libipa_hbac-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libipa_hbac-devel-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libipa_hbac-devel = "
 libipa_hbac
 pkgconf-pkg-config
"

URI_libsss_certmap-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsss_certmap-devel-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsss_certmap-devel = "
 libsss_certmap
 pkgconf-pkg-config
"

URI_libsss_idmap-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsss_idmap-devel-2.10.2-3.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsss_idmap-devel = "
 pkgconf-pkg-config
 libsss_idmap
"
