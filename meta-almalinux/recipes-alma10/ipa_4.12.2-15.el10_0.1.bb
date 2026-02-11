
PN = "ipa"
PE = "0"
PV = "4.12.2"
PR = "15.el10_0.1"
PACKAGES = "ipa-client ipa-client-common ipa-client-encrypted-dns ipa-client-epn ipa-client-samba ipa-common ipa-selinux ipa-selinux-luna ipa-selinux-nfast ipa-server ipa-server-common ipa-server-dns ipa-server-encrypted-dns ipa-server-trust-ad python3-ipaclient python3-ipalib python3-ipaserver python3-ipatests ipa-python-compat"


URI_ipa-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-client-4.12.2-15.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipa-client = "
 python3
 python3-gssapi
 python3-ipaclient
 curl
 cyrus-sasl-gssapi
 krb5-libs
 nss-tools
 krb5-pkinit
 krb5-workstation
 python3-ldap
 nfs-utils
 oddjob-mkhomedir
 jansson
 libsss_autofs
 libsss_sudo
 libcom_err
 libcurl
 openldap
 certmonger
 openssl-libs
 authselect
 autofs
 ipa-client-common
 bash
 ipa-common
 python3-sssdconfig
 libini_config
 sssd-ipa
 sssd-idp
 sssd-krb5
 bind-utils
 chrony
 hostname
 policycoreutils
 sssd-tools
 popt
 libnfsidmap
 glibc
"

URI_ipa-client-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-client-common-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:ipa-client-common = ""

URI_ipa-client-encrypted-dns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-client-encrypted-dns-4.12.2-15.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipa-client-encrypted-dns = "
 unbound
"

URI_ipa-client-epn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-client-epn-4.12.2-15.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipa-client-epn = "
 python3
 systemd
 bash
 ipa-client
"

URI_ipa-client-samba = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-client-samba-4.12.2-15.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipa-client-samba = "
 python3
 samba-client
 samba
 python3-samba
 cifs-utils
 tdb-tools
 ipa-client
 samba-winbind
 sssd-winbind-idmap
 samba-common-tools
"

URI_ipa-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-common-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:ipa-common = "
 ipa-selinux
"

URI_ipa-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-selinux-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:ipa-selinux = "
 policycoreutils-python-utils
 policycoreutils
 bash
 selinux-policy
 libselinux-utils
 selinux-policy-targeted
"

URI_ipa-selinux-luna = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-selinux-luna-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:ipa-selinux-luna = "
 policycoreutils-python-utils
 policycoreutils
 bash
 selinux-policy
 libselinux-utils
 selinux-policy-targeted
"

URI_ipa-selinux-nfast = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-selinux-nfast-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:ipa-selinux-nfast = "
 policycoreutils-python-utils
 policycoreutils
 bash
 selinux-policy
 libselinux-utils
 selinux-policy-targeted
"

URI_ipa-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-server-4.12.2-15.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipa-server = "
 python3
 systemd
 python3-gssapi
 libpwquality
 samba-client-libs
 tar
 fontawesome4-fonts
 cyrus-sasl-gssapi
 krb5-libs
 nss-tools
 python3-ipaserver
 krb5-server
 python3-ldap
 oddjob
 httpd
 jansson
 open-sans-fonts
 libsss_certmap
 acl
 libsss_nss_idmap
 idm-pki-acme
 libcom_err
 idm-pki-ca
 libtalloc
 idm-pki-kra
 slapi-nis
 libtevent
 selinux-policy
 python3-mod_wsgi
 openldap
 libunistring
 openldap-clients
 softhsm
 certmonger
 shadow-utils
 libuuid
 libverto
 openssl
 libgcc
 openssl-libs
 p11-kit
 ipa-client
 bash
 ipa-common
 python3-systemd
 sssd-dbus
 ipa-server-common
 mod_auth_gssapi
 gssproxy
 gzip
 chrony
 mod_lookup_identity
 policycoreutils
 389-ds-base
 popt
 mod_session
 glibc
 mod_ssl
 cracklib-dicts
"

URI_ipa-server-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-server-common-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:ipa-server-common = "
 systemd
 httpd
 ipa-client-common
 bash
 almalinux-logos-ipa
"

URI_ipa-server-dns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-server-dns-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:ipa-server-dns = "
 python3
 softhsm
 ipa-server
 systemd
 bind-dnssec-utils
 bind-dyndb-ldap
 opendnssec
 pkcs11-provider
 bind-utils
 bash
 bind
"

URI_ipa-server-encrypted-dns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-server-encrypted-dns-4.12.2-15.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipa-server-encrypted-dns = "
 ipa-client-encrypted-dns
"

URI_ipa-server-trust-ad = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipa-server-trust-ad-4.12.2-15.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipa-server-trust-ad = "
 python3
 samba
 libpwquality
 samba-client-libs
 krb5-libs
 libsss_idmap
 python3-libsss_nss_idmap
 libcom_err
 samba-winbind
 libtalloc
 libtevent
 alternatives
 openldap
 python3-samba
 openssl-libs
 bash
 python3-sss
 ipa-common
 ipa-server
 sssd-winbind-idmap
 glibc
"

URI_python3-ipaclient = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-ipaclient-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:python3-ipaclient = "
 python3
 augeas-libs
 python3-cryptography
 python3-ipalib
 ipa-client-common
 python3-six
 python3-jinja2
 python3-dns
 python3-qrcode
 ipa-common
 python3-augeas
"

URI_python3-ipalib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-ipalib-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:python3-ipalib = "
 python3
 python3-cffi
 python3-gssapi
 keyutils
 python3-cryptography
 python3-dateutil
 python3-dbus
 python3-ifaddr
 python3-dns
 python3-jwcrypto
 python3-yubico
 python3-ldap
 python3-libipa_hbac
 python3-netaddr
 gnupg2
 python3-requests
 python3-setuptools
 python3-six
 python3-sss-murmur
 ipa-common
 python3-argcomplete
 python3-systemd
 python3-urllib3
 python3-pyasn1
 python3-pyasn1-modules
 python3-pyusb
 python3-qrcode
"

URI_python3-ipaserver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-ipaserver-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:python3-ipaserver = "
 python3
 python3-gssapi
 python3-idm-pki
 python3-cryptography
 python3-dbus
 python3-ipaclient
 python3-ipalib
 python3-dns
 python3-jwcrypto
 python3-kdcproxy
 python3-ldap
 python3-lxml
 python3-netaddr
 python3-requests
 augeas-libs
 python3-six
 python3-sssdconfig
 ipa-common
 python3-augeas
 python3-urllib3
 ipa-server-common
 python3-psutil
 python3-pyasn1
 rpm-libs
"

URI_python3-ipatests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-ipatests-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:python3-ipatests = "
 openssh-clients
 python3-cryptography
 tar
 python3-ipaclient
 python3-ipaserver
 iptables-nft
 python3-sssdconfig
 xz
"

URI_ipa-python-compat = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ipa-python-compat-4.12.2-15.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:ipa-python-compat = "
 ipa-common
 python3-ipalib
"
