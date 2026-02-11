
inherit dnf-bridge

PN = "tomcat"
PE = "1"
PV = "10.1.36"
PR = "1.el10_0"
PACKAGES = "tomcat tomcat-admin-webapps tomcat-docs-webapp tomcat-el-5.0-api tomcat-jsp-3.1-api tomcat-lib tomcat-servlet-6.0-api tomcat-webapps"


URI_tomcat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat-10.1.36-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tomcat = " \
 shadow-utils \
 systemd \
 javapackages-tools \
 bash \
 java-21-openjdk-headless \
 tomcat-lib \
"

URI_tomcat-admin-webapps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat-admin-webapps-10.1.36-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tomcat-admin-webapps = " \
 tomcat \
"

URI_tomcat-docs-webapp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat-docs-webapp-10.1.36-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tomcat-docs-webapp = " \
 tomcat \
"

URI_tomcat-el-5.0-api = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat-el-5.0-api-10.1.36-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tomcat-el-5.0-api = " \
 javapackages-filesystem \
"

URI_tomcat-jsp-3.1-api = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat-jsp-3.1-api-10.1.36-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tomcat-jsp-3.1-api = " \
 tomcat-servlet-6.0-api \
 javapackages-filesystem \
 tomcat-el-5.0-api \
"

URI_tomcat-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat-lib-10.1.36-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tomcat-lib = " \
 javapackages-filesystem \
 tomcat-jsp-3.1-api \
 ecj \
 tomcat-el-5.0-api \
 coreutils \
 tomcat-servlet-6.0-api \
"

URI_tomcat-servlet-6.0-api = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat-servlet-6.0-api-10.1.36-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tomcat-servlet-6.0-api = " \
 javapackages-filesystem \
"

URI_tomcat-webapps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat-webapps-10.1.36-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tomcat-webapps = " \
 tomcat \
"
